
## Quarkus - 2.16.0.Final

[source](./code-with-quarkus)

### Quarkus blocking wrk t16 c100

[report](./reports/quarkus-block-wrk-t16-c100.html)

Total stats from run 0003

| PHASE | METRIC | THROUGHPUT | REQUESTS | MEAN | p50 | p90 | p99 | p99.9 | p99.99 | TIMEOUTS | ERRORS | BLOCKED | 2xx | 3xx | 4xx | 5xx | CACHE |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| calibration | request | 495.71k req/s | 2975266 | 179.80 μs | 164.86 μs | 286.72 μs | 485.38 μs | 1.17 ms | 1.94 ms | 0 | 0 | 0 ns | 2975266 | 0 | 0 | 0  | 0 |
| test | request | 499.75k req/s | 4998525 | 178.31 μs | 164.86 μs | 286.72 μs | 468.99 μs | 1.04 ms | 1.80 ms | 0 | 0 | 0 ns | 4998525 | 0 | 0 | 0 | 0  |
 

### Quarkus Non-blocking  wrk t16 c100

[report](./reports/quarkus-non-block-wrk-t16-c100.html)

[hyperfoil@in-vm]$ stats 0007 

Total stats from run 0007

| PHASE | METRIC | THROUGHPUT | REQUESTS | MEAN | p50 | p90 | p99 | p99.9 | p99.99 | TIMEOUTS | ERRORS | BLOCKED | 2xx | 3xx | 4xx | 5xx | CACHE |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| calibration | request | 669.25k req/s | 4016824 | 129.30 μs | 107.52 μs | 214.02 μs | 466.94 μs | 1.25 ms | 2.18 ms | 0 | 0 | 0 ns | 4016824 | 0 | 0 | 0 | 0 |
|test | request | 680.60k req/s | 6807327 | 127.28 μs | 106.50 μs | 210.94 μs | 440.32 μs | 1.17 ms | 2.23 ms | 0 | 0 | 0 ns | 6807327 | 0 | 0 | 0 | 0 |


## Wildfly - 27.0.1.Final

[source](demo/)

### Wildfly wrk t16 c100

[report](./reports/wildfly-t16-c100-wrk.html)

[hyperfoil@in-vm]$ stats 0010

Total stats from run 0010

| PHASE | METRIC | THROUGHPUT | REQUESTS | MEAN | p50 | p90 | p99 | p99.9 | p99.99 | TIMEOUTS | ERRORS | BLOCKED | 2xx | 3xx | 4xx | 5xx | CACHE |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|calibration | request | 146.71k req/s | 880546 | 669.32 μs | 237.57 μs | 2.06 ms | 3.74 ms | 5.77 ms | 8.00 ms | 0 | 0 | 0 ns | 880546 | 0 | 0 | 0 | 0 |
|test | request | 144.20k req/s | 1442288 | 681.17 μs | 238.59 μs | 2.11 ms | 3.87 ms | 6.03 ms | 8.59 ms | 0 | 0 | 0 ns | 1442288 | 0 | 0 | 0 | 0 |
