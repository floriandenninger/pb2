package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avad extends aonm implements aooz {
    public static final avad a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        avad avadVar = new avad();
        a = avadVar;
        aonm.registerDefaultInstance(avad.class, avadVar);
    }

    private avad() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\uf5b1⼞\uf3fbヺ\u0002\u0000\u0000\u0002\uf5b1⼞ᐼ\u0000\uf3fbヺᐼ\u0000", new Object[]{"c", "b", aqgn.class, arej.class});
            case NEW_MUTABLE_INSTANCE:
                return new avad();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avad.class) {
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
