package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asbo extends aonm implements aooz {
    public static final asbo a;
    private static volatile aopf h;
    public int b;
    public arnb c;
    public atnf g;
    private byte i = 2;
    public aony d = aonm.emptyProtobufList();
    public String e = "";
    public String f = "";

    static {
        asbo asboVar = new asbo();
        a = asboVar;
        aonm.registerDefaultInstance(asbo.class, asboVar);
    }

    private asbo() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asbo();
            case NEW_BUILDER:
                return new aone((boolean[][][]) null, (char[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (asbo.class) {
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
