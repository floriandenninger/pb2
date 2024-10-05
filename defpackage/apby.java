package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apby extends aonm implements aooz {
    public static final apby a;
    private static volatile aopf e;
    public int b;
    public int c;
    public aqyg d;
    private apxf f;
    private byte g = 2;

    static {
        apby apbyVar = new apby();
        a = apbyVar;
        aonm.registerDefaultInstance(apby.class, apbyVar);
    }

    private apby() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", apaf.d, "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apby();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (apby.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
