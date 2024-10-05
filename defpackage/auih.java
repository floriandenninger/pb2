package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auih extends aonm implements aooz {
    public static final auih a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        auih auihVar = new auih();
        a = auihVar;
        aonm.registerDefaultInstance(auih.class, auihVar);
    }

    private auih() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uecb1┛\uedcc㐚\u0004\u0000\u0000\u0003\uecb1┛ᐼ\u0000\uecb4┛ᐼ\u0000\uf2b9〧ᐼ\u0000\uedcc㐚ြ\u0000", new Object[]{"c", "b", apeo.class, asju.class, aphy.class, asjo.class});
            case NEW_MUTABLE_INSTANCE:
                return new auih();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (auih.class) {
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
