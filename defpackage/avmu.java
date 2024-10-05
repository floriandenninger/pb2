package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avmu extends aonm implements aooz {
    public static final avmu a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        avmu avmuVar = new avmu();
        a = avmuVar;
        aonm.registerDefaultInstance(avmu.class, avmuVar);
    }

    private avmu() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf321Ẑ\ue91b㲾\u0004\u0000\u0000\u0004\uf321Ẑᐼ\u0000\uf26a⤒ᐼ\u0000\uf49e㲔ᐼ\u0000\ue91b㲾ᐼ\u0000", new Object[]{"c", "b", aqdt.class, asjh.class, avmw.class, avmv.class});
            case NEW_MUTABLE_INSTANCE:
                return new avmu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avmu.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
