package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arqd extends aonm implements aooz {
    public static final arqd a;
    private static volatile aopf h;
    public int b;
    public arnb c;
    public boolean e;
    public arqa f;
    public boolean g;
    private byte i = 2;
    public aony d = aonm.emptyProtobufList();

    static {
        arqd arqdVar = new arqd();
        a = arqdVar;
        aonm.registerDefaultInstance(arqd.class, arqdVar);
    }

    private arqd() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a\u0003ဇ\u0001\u0004ဉ\u0002\u0005ဇ\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new arqd();
            case NEW_BUILDER:
                return new aone((int[][][]) null, (boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arqd.class) {
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
