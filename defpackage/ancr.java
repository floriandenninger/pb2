package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ancr extends aonh implements aoni {
    public static final ancr a;
    private static volatile aopf m;
    public int b;
    public int c;
    public int g;
    public aosi h;
    public int i;
    public ancj k;
    private byte n = 2;
    public int d = -1;
    public aonu e = emptyIntList();
    public String f = "";
    public int j = -1;

    static {
        ancr ancrVar = new ancr();
        a = ancrVar;
        aonm.registerDefaultInstance(ancr.class, ancrVar);
    }

    private ancr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001è\t\u0000\u0001\u0002\u0001င\u0000\u0003င\u0001\u0004\u0016\u0005ဈ\u0002\u0006ဌ\u0005\u0007င\u0003\u000bᐉ\u0004\u0095င\u0007èᐉ\b", new Object[]{"b", "c", "d", "e", "f", "i", aduo.t, "g", "h", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new ancr();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (ancr.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
