package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ansu extends aonm implements aooz {
    public static final ansu a;
    private static volatile aopf j;
    public int b;
    public Object d;
    public Object f;
    public int h;
    public int c = 0;
    public int e = 0;
    private byte k = 2;
    public String g = "";
    public String i = "";

    static {
        ansu ansuVar = new ansu();
        a = ansuVar;
        aonm.registerDefaultInstance(ansu.class, ansuVar);
    }

    private ansu() {
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
                return newMessageInfo(a, "\u0001\u0007\u0002\u0001\u0001\u000b\u0007\u0000\u0000\u0001\u0001ျ\u0000\u0002ဈ\u0003\u0003ဌ\u0005\u0005ြ\u0001\u0006ြ\u0000\nဈ\u0007\u000bᐼ\u0000", new Object[]{"d", "c", "f", "e", "b", "g", "h", ancx.n, anst.class, ansr.class, "i", anss.class});
            case NEW_MUTABLE_INSTANCE:
                return new ansu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (ansu.class) {
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
