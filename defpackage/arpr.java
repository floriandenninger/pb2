package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arpr extends aonm implements aooz {
    public static final arpr a;
    private static volatile aopf h;
    public int b;
    public arnb c;
    public long d;
    public arpv e;
    public int g;
    private byte i = 2;
    public aony f = emptyProtobufList();

    static {
        arpr arprVar = new arpr();
        a = arprVar;
        aonm.registerDefaultInstance(arpr.class, arprVar);
    }

    private arpr() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဂ\u0001\u0003Л\u0005ဉ\u0002\u0007ဌ\u0005", new Object[]{"b", "c", "d", "f", arpp.class, "e", "g", aqjm.a()});
            case NEW_MUTABLE_INSTANCE:
                return new arpr();
            case NEW_BUILDER:
                return new aone((byte[]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arpr.class) {
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
