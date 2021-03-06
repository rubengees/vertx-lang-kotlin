/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.pgclient

import io.vertx.core.Vertx
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.pgclient.PgConnectOptions
import io.vertx.pgclient.PgConnection as PgConnectionVertxAlias
import io.vertx.sqlclient.PreparedQuery
import io.vertx.sqlclient.Row
import io.vertx.sqlclient.RowSet
import io.vertx.sqlclient.Tuple

/**
 * Suspending version of method [io.vertx.pgclient.PgConnection.prepare]
 *
 * @param sql 
 * @return [PreparedQuery]
 *
 * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgConnection] using Vert.x codegen.
 */
suspend fun PgConnectionVertxAlias.prepareAwait(sql: String): PreparedQuery {
  return awaitResult {
    this.prepare(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.pgclient.PgConnection.preparedQuery]
 *
 * @param sql 
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgConnection] using Vert.x codegen.
 */
suspend fun PgConnectionVertxAlias.preparedQueryAwait(sql: String): RowSet<Row> {
  return awaitResult {
    this.preparedQuery(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.pgclient.PgConnection.query]
 *
 * @param sql 
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgConnection] using Vert.x codegen.
 */
suspend fun PgConnectionVertxAlias.queryAwait(sql: String): RowSet<Row> {
  return awaitResult {
    this.query(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.pgclient.PgConnection.preparedQuery]
 *
 * @param sql 
 * @param arguments 
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgConnection] using Vert.x codegen.
 */
suspend fun PgConnectionVertxAlias.preparedQueryAwait(sql: String, arguments: Tuple): RowSet<Row> {
  return awaitResult {
    this.preparedQuery(sql, arguments, it)
  }
}

/**
 * Suspending version of method [io.vertx.pgclient.PgConnection.preparedBatch]
 *
 * @param sql 
 * @param batch 
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgConnection] using Vert.x codegen.
 */
suspend fun PgConnectionVertxAlias.preparedBatchAwait(sql: String, batch: List<Tuple>): RowSet<Row> {
  return awaitResult {
    this.preparedBatch(sql, batch, it)
  }
}

object PgConnection {
  /**
   * Suspending version of method [io.vertx.pgclient.PgConnection.connect]
   *
   * @param vertx the vertx instance
   * @param options the connect options
   * @return [PgConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgConnection] using Vert.x codegen.
   */
  suspend fun connectAwait(vertx: Vertx, options: PgConnectOptions): PgConnectionVertxAlias {
    return awaitResult {
      PgConnectionVertxAlias.connect(vertx, options, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.pgclient.PgConnection.connect]
   *
   * @param vertx 
   * @return [PgConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgConnection] using Vert.x codegen.
   */
  suspend fun connectAwait(vertx: Vertx): PgConnectionVertxAlias {
    return awaitResult {
      PgConnectionVertxAlias.connect(vertx, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.pgclient.PgConnection.connect]
   *
   * @param vertx 
   * @param connectionUri 
   * @return [PgConnectionVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgConnection] using Vert.x codegen.
   */
  suspend fun connectAwait(vertx: Vertx, connectionUri: String): PgConnectionVertxAlias {
    return awaitResult {
      PgConnectionVertxAlias.connect(vertx, connectionUri, it)
    }
  }

}
