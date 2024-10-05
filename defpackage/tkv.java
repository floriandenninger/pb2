package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tkv extends aonm implements aooz {
    public static final tkv a;
    private static volatile aopf u;
    public int b;
    public tku c;
    public int f;
    public aols g;
    public aols h;
    public int i;
    public long j;
    public long k;
    public tkx l;
    public boolean m;
    public int o;
    public int q;
    public long r;
    public String d = "";
    public String e = "";
    public aony n = emptyProtobufList();
    public aony p = emptyProtobufList();
    public String s = "";
    public aony t = aonm.emptyProtobufList();

    static {
        tkv tkvVar = new tkv();
        a = tkvVar;
        aonm.registerDefaultInstance(tkv.class, tkvVar);
    }

    private tkv() {
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001年皤\u0012\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003ဂ\b\u0006ဈ\u0002\nင\u0003\u000bဂ\t\fဌ\u0007\rဉ\n\u000eဇ\u000b\u0010င\f\u0011\u001b\u0013ဌ\r\u0014ဉ\u0004\u0017ဂ\u000e\u0019\u001a\u001aဈ\u000f\u001bဉ\u0005年皤ဉ\u0000", new Object[]{"b", "d", "n", tkt.class, "j", "e", "f", "k", "i", sgo.n, "l", "m", "o", "p", tky.class, "q", sgo.t, "g", "r", "t", "s", "h", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new tkv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = u;
                if (aopfVar == null) {
                    synchronized (tkv.class) {
                        aopfVar = u;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            u = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
