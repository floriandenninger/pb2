package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sgl extends aonh implements aoni {
    public static final /* synthetic */ int a = 0;
    private static final sgl b;
    private static volatile aopf c;
    private byte d = 2;

    static {
        sgl sglVar = new sgl();
        b = sglVar;
        aonm.registerDefaultInstance(sgl.class, sglVar);
    }

    private sgl() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new sgl();
            case NEW_BUILDER:
                return new aong(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (sgl.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
