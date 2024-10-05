package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aran extends aonm implements aooz {
    public static final aran a;
    private static volatile aopf b;
    private int c;
    private aqbo d;
    private aqbj e;
    private aqbs f;
    private aqca g;
    private byte h = 2;

    static {
        aran aranVar = new aran();
        a = aranVar;
        aonm.registerDefaultInstance(aran.class, aranVar);
    }

    private aran() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uef41ᠸ\ue974⢵\u0004\u0000\u0000\u0004\uef41ᠸᐉ\u0001ﾾ‶ᐉ\u0003\ued6a▻ᐉ\u0002\ue974⢵ᐉ\u0000", new Object[]{"c", "e", "g", "f", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aran();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aran.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
