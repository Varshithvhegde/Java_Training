## Thread

- java is the multi Threaded programming language 

Life cycle of Thread

- New
- Runnable
- Running
- Non-Runnable(dead)
- Terminated
- Waiting

## What is Single Threaded Programming?

- In single threaded programming, only one thread is executed at a time.

## What is Multi Threaded Programming?

- In multi threaded programming, multiple threads are executed at a time.
- Advantages
  - The users not blocked
  - not effect another thread while one thread is waiting for I/O(Exception)

## Working of Java Thread Scheduler

- The thread scheduler is a part of the JVM.
- It is responsible for scheduling the threads.
- It schedules the threads on the basis of priority.

## Thread Priorities

- Thread priorities are in the range of 1 to 10.
- The default priority of a thread is 5.
- The thread with the highest priority is executed first.

## Deamon Thread

- A thread which is running in the background is called a daemon thread.
- It provides services to the user threads for background supporting tasks.
- Its life depends on the user threads.
- it is a low priority thread.It has no role in the life cycle of the application.

## Serialization

- Serialization is a mechanism of writing the state of an object into a byte stream.
- Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.

## Generics

- Generics is a feature that was added to the Java programming language in JDK 5.0.
- Generics provides compile-time type safety that allows programmers to catch invalid types at compile time.
- Generics also provide runtime performance benefits by eliminating the need for type casting.