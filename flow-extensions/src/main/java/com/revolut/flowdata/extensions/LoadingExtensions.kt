package com.revolut.flowdata.extensions

import com.revolut.data.model.Data
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter

/*
 * Copyright (C) 2022 Revolut
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

fun <T> Flow<Data<T>>.filterWhileLoading(): Flow<Data<T>> =
    filter { data -> !data.loading }
