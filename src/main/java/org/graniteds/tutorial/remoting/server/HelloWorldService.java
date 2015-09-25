package org.graniteds.tutorial.remoting.server;

import org.granite.messaging.service.annotations.RemoteDestination;

// tag::remote-destination[]
@RemoteDestination
public interface HelloWorldService {

    String hello(String name);
}
// end::remote-destination[]
