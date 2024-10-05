package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arje extends aonm implements aooz {
    public static final arje a;
    private static volatile aopf f;
    public int b;
    public arjj c;
    public arjl d;
    public arjn e;
    private arjf g;
    private byte h = 2;

    static {
        arje arjeVar = new arje();
        a = arjeVar;
        aonm.registerDefaultInstance(arje.class, arjeVar);
    }

    private arje() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ue7cb㙌\ue171嶍\u0004\u0000\u0000\u0004\ue7cb㙌ᐉ\u0000\ue3dc喠ᐉ\u0001\uebd3坩ᐉ\u0002\ue171嶍ᐉ\u0003", new Object[]{"b", "c", "g", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new arje();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arje.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
