package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aswm extends aonm implements aooz {
    public static final aswm a;
    private static volatile aopf h;
    public int b;
    public arnb c;
    public atox d;
    public aswl e;
    public int f;
    private byte i = 2;
    public aony g = aonm.emptyProtobufList();

    static {
        aswm aswmVar = new aswm();
        a = aswmVar;
        aonm.registerDefaultInstance(aswm.class, aswmVar);
    }

    private aswm() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005\u001a", new Object[]{"b", "c", "d", "e", "f", aqme.a(), "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aswm();
            case NEW_BUILDER:
                return new aone((int[][][]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aswm.class) {
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
