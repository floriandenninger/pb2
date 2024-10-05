package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes5.dex */
abstract class StreamSpliterators$ArrayBuffer {
    int index;

    StreamSpliterators$ArrayBuffer() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reset() {
        this.index = 0;
    }

    /* loaded from: classes5.dex */
    final class OfRef extends StreamSpliterators$ArrayBuffer implements Consumer {
        final Object[] array;

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfRef(int i) {
            this.array = new Object[i];
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            Object[] objArr = this.array;
            int i = this.index;
            this.index = i + 1;
            objArr[i] = obj;
        }

        public void forEach(Consumer consumer, long j) {
            for (int i = 0; i < j; i++) {
                consumer.accept(this.array[i]);
            }
        }
    }
}
