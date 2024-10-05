package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apqi extends aonm implements aooz {
    public static final apqi a;
    private static volatile aopf g;
    public int b;
    public apmp c;
    public apmg d;
    public avae e;
    public avaa f;
    private byte h = 2;

    static {
        apqi apqiVar = new apqi();
        a = apqiVar;
        aonm.registerDefaultInstance(apqi.class, apqiVar);
    }

    private apqi() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ueb11ἑﺷ䃢\u0004\u0000\u0000\u0004\ueb11ἑᐉ\u0001\ue5d8☢ᐉ\u0000\ue1ae㣚ᐉ\u0002ﺷ䃢ᐉ\u0003", new Object[]{"b", "d", "c", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apqi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apqi.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
