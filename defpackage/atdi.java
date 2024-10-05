package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atdi extends aonm implements aooz {
    public static final atdi a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atdi atdiVar = new atdi();
        a = atdiVar;
        aonm.registerDefaultInstance(atdi.class, atdiVar);
    }

    private atdi() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000陋⊅\uef56\u2cf8\u0003\u0000\u0000\u0003陋⊅ᐼ\u0000\ue97d✹ᐼ\u0000\uef56\u2cf8ᐼ\u0000", new Object[]{"c", "b", atjl.class, atdh.class, aqdv.class});
            case NEW_MUTABLE_INSTANCE:
                return new atdi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atdi.class) {
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
