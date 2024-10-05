package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avxx extends aonm implements aooz {
    public static final avxx a;
    private static volatile aopf l;
    public int b;
    public long g;
    public long h;
    public int i;
    public avgg j;
    public int k;
    private byte m = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        avxx avxxVar = new avxx();
        a = avxxVar;
        aonm.registerDefaultInstance(avxx.class, avxxVar);
    }

    private avxx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဃ\u0004\u0006ဃ\u0005\u0007င\u0006\bᐉ\u0007\tင\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new avxx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (avxx.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
