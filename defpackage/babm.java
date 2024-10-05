package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class babm extends aonh implements aoni {
    public static final babm a;
    private static volatile aopf h;
    public int b;
    public babl c;
    public bacd d;
    public int e;
    public babk f;
    private byte i = 2;
    public String g = "";

    static {
        babm babmVar = new babm();
        a = babmVar;
        aonm.registerDefaultInstance(babm.class, babmVar);
    }

    private babm() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", axcs.p, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new babm();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (babm.class) {
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
