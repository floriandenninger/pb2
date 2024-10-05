package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adww extends aonm implements aooz {
    public static final adww a;
    private static volatile aopf f;
    public int b;
    public boolean d;
    public aoot e = aoot.a;
    public String c = "";

    static {
        adww adwwVar = new adww();
        a = adwwVar;
        aonm.registerDefaultInstance(adww.class, adwwVar);
    }

    private adww() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u00032", new Object[]{"b", "c", "d", "e", adwv.a});
            case NEW_MUTABLE_INSTANCE:
                return new adww();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (adww.class) {
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
