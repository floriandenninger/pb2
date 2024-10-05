package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asai extends aonm implements aooz {
    public static final asai a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asai asaiVar = new asai();
        a = asaiVar;
        aonm.registerDefaultInstance(asai.class, asaiVar);
    }

    private asai() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0000\ue7f5ណ\ueaaa䯴\u0006\u0000\u0000\u0006\ue7f5ណᐼ\u0000\ue1faᠿᐼ\u0000\ue592᯦ᐼ\u0000\ue3bf᳙ᐼ\u0000\uebfa╈ᐼ\u0000\ueaaa䯴ᐼ\u0000", new Object[]{"c", "b", auov.class, asan.class, atdn.class, asam.class, asaa.class, avrq.class});
            case NEW_MUTABLE_INSTANCE:
                return new asai();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asai.class) {
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
