package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aojq extends aonm implements aooz {
    public static final aojq a;
    private static volatile aopf s;
    public int b;
    public float c;
    public int d;
    public int j;
    public int o;
    public aokk q;
    public aokq r;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String k = "";
    public String l = "";
    public aony m = emptyProtobufList();
    public aony n = emptyProtobufList();
    public String p = "";

    static {
        aojq aojqVar = new aojq();
        a = aojqVar;
        aonm.registerDefaultInstance(aojq.class, aojqVar);
    }

    private aojq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0002\u0011\u0010\u0000\u0002\u0000\u0002ခ\u0000\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007င\u0007\bဈ\b\tဌ\u0001\nဈ\u0002\u000bဈ\t\f\u001b\r\u001b\u000eဌ\n\u000fဈ\u000b\u0010ဉ\f\u0011ဉ\r", new Object[]{"b", "c", "f", "g", "h", "i", "j", "k", "d", aoib.l, "e", "l", "m", aojo.class, "n", aojp.class, "o", aoib.i, "p", "q", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new aojq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = s;
                if (aopfVar == null) {
                    synchronized (aojq.class) {
                        aopfVar = s;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            s = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
