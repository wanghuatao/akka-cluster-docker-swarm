package com.github.experiments

import org.slf4j.LoggerFactory

trait LoggerHolder {
val log = LoggerFactory.getLogger(this.getClass)
}
