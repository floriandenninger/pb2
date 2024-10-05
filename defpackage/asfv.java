package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfv extends aonm implements aooz {
    public static final asfv a;
    private static volatile aopf o;
    public int b;
    public arnb c;
    public arma j;
    public apuf n;
    private byte p = 2;
    public String d = "";
    public aomf e = aomf.b;
    public String f = "";
    public String g = "";
    public aomf h = aomf.b;
    public String i = "";
    public aomf k = aomf.b;
    public aomf l = aomf.b;
    public String m = "";

    static {
        asfv asfvVar = new asfv();
        a = asfvVar;
        aonm.registerDefaultInstance(asfv.class, asfvVar);
    }

    private asfv() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005ᐉ\u0007\u0006ည\b\u0007ည\t\bည\u0002\tဈ\n\nည\u0005\u000bဈ\u0006\fဉ\u000b", new Object[]{"b", "c", "d", "f", "g", "j", "k", "l", "e", "m", "h", "i", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new asfv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (asfv.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
