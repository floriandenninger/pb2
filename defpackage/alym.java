package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alym extends aonh implements aoni {
    public static final alym a;
    private static volatile aopf j;
    public int b;
    public boolean g;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String h = "";
    public String i = "";

    static {
        alym alymVar = new alym();
        a = alymVar;
        aonm.registerDefaultInstance(alym.class, alymVar);
    }

    private alym() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဇ\u0006\u0006ဈ\u0007\u0007ဈ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new alym();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (alym.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
