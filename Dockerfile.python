
FROM samber/github-actions-runner:latest

USER root

RUN apt-get update \
    && apt-get install -y -q libffi-dev python3-dev python3-pip python3-setuptools \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

USER runner
