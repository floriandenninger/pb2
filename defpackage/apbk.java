package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apbk extends aonm implements aooz {
    public static final apbk a;
    private static volatile aopf h;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;
    public boolean g;

    static {
        apbk apbkVar = new apbk();
        a = apbkVar;
        aonm.registerDefaultInstance(apbk.class, apbkVar);
    }

    private apbk() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ဇ\u0004", new Object[]{"d", "c", "b", "e", apah.a(), "f", apag.a(), apbb.class, apbl.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apbk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (apbk.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
