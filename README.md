![build status](https://github.com/xxSlashxx/algorithms/actions/workflows/maven.yml/badge.svg)
[![codecov](https://codecov.io/gh/xxSlashxx/algorithms/graph/badge.svg?token=7HQGXS37O3)](https://codecov.io/gh/xxSlashxx/algorithms)
# Algorithms

## Overview
This repository contains implementations of several basic sorting algorithms in Java. Sorting is one of the fundamental problems in computer science, and these algorithms are often used to demonstrate different techniques and concepts in algorithm design.

## Algorithms Included
The following sorting algorithms are implemented:

- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort

Each algorithm is implemented in its own file.

## Algorithm Descriptions

### 1. Bubble Sort
Bubble Sort works by repeatedly stepping through the list, comparing adjacent elements, and swapping them if they are in the wrong order. The process repeats until the list is sorted.

- **Time Complexity:** O(n^2) (Best: O(n) if already sorted)
- **Space Complexity:** O(1)

### 2. Selection Sort
Selection Sort divides the list into two parts: a sorted part and an unsorted part. It repeatedly selects the smallest element from the unsorted part and swaps it with the leftmost unsorted element.

- **Time Complexity:** O(n^2)
- **Space Complexity:** O(1)

### 3. Insertion Sort
Insertion Sort builds the sorted list one item at a time. It takes each element from the unsorted part and inserts it into its correct position in the sorted part.

- **Time Complexity:** O(n^2) (Best: O(n) when the list is nearly sorted)
- **Space Complexity:** O(1)

### 4. Merge Sort
Merge Sort is a divide-and-conquer algorithm. It divides the list into two halves, recursively sorts each half, and then merges the two sorted halves back together.

- **Time Complexity:** O(n log n)
- **Space Complexity:** O(n)