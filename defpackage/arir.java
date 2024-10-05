package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arir extends aonm implements aooz {
    public static final arir a;
    private static volatile aopf l;
    public int b;
    public arnb c;
    public long e;
    public int f;
    public atwv g;
    public long j;
    public long k;
    private byte m = 2;
    public String d = "";
    public String h = "";
    public String i = "";

    static {
        arir arirVar = new arir();
        a = arirVar;
        aonm.registerDefaultInstance(arir.class, arirVar);
    }

    private arir() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0016\t\u0000\u0000\u0002\u0001ᐉ\u0001\u0002ဈ\u0002\u0003ဂ\u0003\u0004င\u0004\u0005ᐉ\u0005\u0006ဈ\u0006\u000fဈ\u000f\u0010ဃ\u0010\u0016ဂ\u0015", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new arir();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (arir.class) {
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
