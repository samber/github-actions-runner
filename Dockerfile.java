
FROM samber/github-actions-runner:latest

USER root

RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list \
    && curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | apt-key add \
    && apt-get update                                                   \
    && apt-get install -y -q default-jdk maven gradle sbt                  \
    && apt-get clean                                                    \
    && rm -rf /var/lib/apt/lists/*

USER runner
