package com.avast.server.toolkit.ssl

import com.avast.server.toolkit.ssl.Protocol.TLS
import com.avast.server.toolkit.ssl.Protocol.TLS

final case class SslContextConfig(protocol: Protocol = TLS,
                                  keystore: Option[KeyStoreConfig] = None,
                                  truststore: Option[KeyStoreConfig] = None,
                                  loadSystemKeyManagers: Boolean = true,
                                  loadSystemTrustManagers: Boolean = true)