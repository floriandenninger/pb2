package j$.util.stream;

/* loaded from: classes5.dex */
abstract class AbstractSpinedBuffer {
    protected int elementIndex;
    protected final int initialChunkPower = 4;
    protected long[] priorElementCount;
    protected int spineIndex;

    public abstract void clear();

    public long count() {
        int i = this.spineIndex;
        if (i == 0) {
            return this.elementIndex;
        }
        return this.priorElementCount[i] + this.elementIndex;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int chunkSize(int i) {
        int i2;
        if (i == 0 || i == 1) {
            i2 = this.initialChunkPower;
        } else {
            i2 = Math.min((this.initialChunkPower + i) - 1, 30);
        }
        return 1 << i2;
    }
}
