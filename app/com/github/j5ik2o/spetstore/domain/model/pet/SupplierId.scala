package com.github.j5ik2o.spetstore.domain.model.pet

import com.github.j5ik2o.spetstore.domain.infrastructure.support.Identifier
import java.util.UUID

/**
 * [[com.github.j5ik2o.spetstore.domain.model.pet.Supplier]]のための識別子。
 *
 * @param value 識別子の値
 */
case class SupplierId(value: UUID = UUID.randomUUID())
  extends Identifier[UUID]
