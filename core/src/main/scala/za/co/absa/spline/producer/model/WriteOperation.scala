/*
 * Copyright 2021 ABSA Group Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package za.co.absa.spline.producer.model

case class WriteOperation (
  outputSource: String,
  append: Boolean,
  id: String,
  name: String,
  childIds: Seq[String],
  params: Map[String, Any],
  extra: Map[String, Any]
) extends Operation {
  override def output: Seq[String] = Seq.empty
}
