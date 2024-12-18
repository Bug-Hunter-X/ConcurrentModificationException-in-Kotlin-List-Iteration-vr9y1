# ConcurrentModificationException in Kotlin List Iteration

This repository demonstrates a common error when modifying a list while iterating over it in Kotlin.  The `removeIf` function can lead to unexpected behavior, and iterating and removing elements simultaneously requires careful handling to prevent a `ConcurrentModificationException`. The example shows how to solve this problem using the indices based approach and iterators.

## Problem

The initial code attempts to remove elements from a list while iterating using the list indices. This causes the program to throw `ConcurrentModificationException` because the list's internal structure is altered during iteration.

## Solution

The solution demonstrates correct ways to remove elements from a list during iteration.  By using an iterator or working directly on the index to remove elements before changing to the next one, the issue is solved without concurrent modification exceptions.
