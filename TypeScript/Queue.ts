type QNode<T> = {
  value: T,
  next?: QNode<T>
}

class Queue<T>{
  public length: number;
  private head?: QNode<T>;
  private tail?: QNode<T>;

  constructor(){

    this.head = this.tail = undefined;
    this.length = 0;

  }

  enqueue(item: T) {

    const newNode: QNode<T> = {value: item}

    this.length++;

    if (!this.tail){
      this.tail = this.head = newNode;
    }

    // current tail should point at new Node
    this.tail.next = newNode;

    // now our latest tail is that node
    this.tail = newNode;

  }

  dequeue() : T | undefined {

    // return undefined if no elements to dequeue
    if (!this.head){
      return undefined;
    }

    this.length--;

    // storing current head pointer 
    const head = this.head;

    // assign the next pointer to current head
    this.head = this.head.next;

    // no optional chaining here because at this point it is certain that head exists;
    return head.value;
  }

  peek(): T | undefined{
    return this.head?.value;
  }

}

const testQueue = new Queue<number>();

testQueue.enqueue(10);
testQueue.enqueue(2);
testQueue.enqueue(3);
console.log(testQueue.peek());
