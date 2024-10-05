package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqac extends aonm implements aooz {
    public static final aqac a;
    private static volatile aopf h;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public int f;
    public aqyg g;
    private byte i = 2;

    static {
        aqac aqacVar = new aqac();
        a = aqacVar;
        aonm.registerDefaultInstance(aqac.class, aqacVar);
    }

    private aqac() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဌ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", avww.a(), "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqac();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqac.class) {
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
