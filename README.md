🚀 Java Streams Practice

A collection of Java Stream API examples, organized topic-wise for hands-on learning and interview preparation.

📂 Project Structure
stream-practice/                                                                                                        
 └── src/                                                                                                        
     └── practice/                                                                                                        
         ├── basics/                                                                                                        
         │    ├── FilterExample.java                                                                                                    
         │    ├── MapExample.java                                                                                                    
         │    ├── ReduceExample.java                                                                                                    
         │    └── CollectExample.java                                                                                                    
         │
         ├── transformations/                                                                                                    
         │    ├── FlatMapExample.java                                                                                                    
         │    ├── SortingExample.java                                                                                                    
         │    └── DistinctLimitSkipExample.java                                                                                                    
         │
         ├── grouping/                                                                                                    
         │    ├── GroupingByExample.java                                                                                                    
         │    ├── PartitioningByExample.java                                                                                                    
         │    └── SummarizingExample.java                                                                                                    
         │
         ├── matching/                                                                                                    
         │    ├── MatchExample.java                                                                                                    
         │    ├── FindExample.java                                                                                                    
         │    └── MinMaxExample.java                                                                                                    
         │                                                                                                    
         ├── advanced/                                                                                                    
         │    ├── JoiningExample.java                                                                                                    
         │    ├── ToMapExample.java                                                                                                    
         │    ├── FrequencyMapExample.java                                                                                                    
         │    └── DuplicateFinderExample.java                                                                                                    
         │
         └── parallel/                                                                                                    
              ├── ParallelStreamExample.java                                                                                                    
              └── PerformanceComparison.java                                                                                                    

📍 Topics Covered
1. Basics
    ->Filtering (filter)
    ->Mapping (map)
    ->Reduction (reduce)
    ->Collectors (toList, toSet)

2. Transformations
    ->Flattening (flatMap)
    ->Sorting (sorted)
    ->Removing duplicates, limiting, skipping (distinct, limit, skip)

3. Grouping & Partitioning
    ->Grouping by key (groupingBy)
    ->Partitioning into buckets (partitioningBy)
    ->Summarizing statistics (summarizingInt, summarizingDouble)

4. Matching & Finding
    ->Match checks (anyMatch, allMatch, noneMatch)
    ->Finding elements (findFirst, findAny)
    ->Min/Max values

5. Advanced Collectors
    ->Joining strings (joining)
    ->Collecting to Map (toMap)
    ->Frequency counters (groupingBy + counting)
    ->Duplicate detection

6. Parallel Streams
    ->Parallel processing (parallelStream)
    ->Performance comparisons

🛠️ How to Run

Clone the repo:
    -> git clone https://github.com/your-username/stream-practice.git
    -> Open in your IDE (IntelliJ, Eclipse, VS Code).
    -> Run any example class with:
    -> javac practice/basics/FilterExample.java
    -> java practice.basics.FilterExample

🎯 Goals

Build strong fundamentals in Java Stream API.
Cover all intermediate + terminal operations.
Practice real interview-style problems.
