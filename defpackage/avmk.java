package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avmk extends aonm implements aooz {
    public static final avmk a;
    private static volatile aopf h;
    public int b;
    public avlx c;
    public avmc d;
    public avmq e;
    public avmp f;
    public avlt g;
    private avlz i;
    private avlv j;
    private byte k = 2;

    static {
        avmk avmkVar = new avmk();
        a = avmkVar;
        aonm.registerDefaultInstance(avmk.class, avmkVar);
    }

    private avmk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\ue084⦔\uf5e5族\u0007\u0000\u0000\u0007\ue084⦔ᐉ\u0003\uee27⦜ᐉ\u0001\uee6f⦽ᐉ\u0000\uee75㿤ᐉ\u0002זּ䘞ᐉ\u0005\uf281冯ᐉ\u0006\uf5e5族ᐉ\u0004", new Object[]{"b", "e", "c", "i", "d", "j", "g", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avmk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (avmk.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
