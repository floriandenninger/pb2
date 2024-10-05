package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ovr extends aonm implements aooz {
    public static final ovr a;
    private static volatile aopf p;
    public int b;
    public long g;
    public long h;
    public ovp i;
    public long j;
    public ovq l;
    public long m;
    public ajcc n;
    public aoms o;
    private byte q = 2;
    public int c = 8;
    public String d = "";
    public String e = "";
    public String f = "";
    public aony k = aonm.emptyProtobufList();

    static {
        ovr ovrVar = new ovr();
        a = ovrVar;
        aonm.registerDefaultInstance(ovr.class, ovrVar);
    }

    private ovr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0018\r\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0006\u0005ဃ\u0004\u0006ဂ\u0005\u0007ဂ\u0007\u000b\u001a\u000eဉ\f\u000fဈ\u0003\u0012ဂ\u000f\u0017ဉ\u0014\u0018ဉ\u0015", new Object[]{"b", "c", dvg.k, "d", "e", "i", "g", "h", "j", "k", "l", "f", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new ovr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (ovr.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
