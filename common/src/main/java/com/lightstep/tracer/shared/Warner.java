package com.lightstep.tracer.shared;

public interface Warner {
  void warn(String message);

  void error(String message);
}
