package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apya extends aonm implements aooz {
    public static final apya a;
    private static volatile aopf u;
    public int b;
    public boolean i;
    public apxf j;
    public apxf k;
    public boolean m;
    public apxf o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public apxf t;
    private byte v = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public aony f = emptyProtobufList();
    public aony g = emptyProtobufList();
    public String h = "";
    public String l = "";
    public String n = "";

    static {
        apya apyaVar = new apya();
        a = apyaVar;
        aonm.registerDefaultInstance(apya.class, apyaVar);
    }

    private apya() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.v);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0002\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005ဈ\u0003\u0006ဇ\u0004\u0007ဈ\u0007\bဇ\b\tဈ\t\nᐉ\u0005\u000bᐉ\u0006\fᐉ\n\rဇ\u000b\u000eဇ\f\u000fဇ\r\u0011ဇ\u000e\u0012Л\u0013ᐉ\u000f", new Object[]{"b", "c", "d", "e", "f", awtx.class, "h", "i", "l", "m", "n", "j", "k", "o", "p", "q", "r", "s", "g", awts.class, "t"});
            case NEW_MUTABLE_INSTANCE:
                return new apya();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = u;
                if (aopfVar == null) {
                    synchronized (apya.class) {
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
