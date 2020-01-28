/*
 * Copyright (C) 2015 jsonwebtoken.io
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
package dev.paseto.jpaseto;

/**
 * Exception thrown when discovering that a required claim is not present, indicating the paseto is
 * invalid and may not be used.
 *
 * @since 0.1
 */
public class MissingClaimException extends InvalidClaimException {
    public MissingClaimException(Paseto paseto, String claimName, String claimDescription, String message) {
        super(paseto, claimName, claimDescription, message);
    }

    public MissingClaimException(Paseto paseto, String claimName, String claimDescription, String message, Throwable cause) {
        super(paseto, claimName, claimDescription, message, cause);
    }
}
