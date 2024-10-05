package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqnr extends aonm implements aooz {
    public static final aqnr a;
    public static final aonk b;
    private static volatile aopf p;
    public int c;
    public Object e;
    public int k;
    public int n;
    public int d = 0;
    private byte q = 2;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String l = "";
    public String m = "";
    public String o = "";

    static {
        aqnr aqnrVar = new aqnr();
        a = aqnrVar;
        aonm.registerDefaultInstance(aqnr.class, aqnrVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, aqnrVar, aqnrVar, null, 192, aoqn.MESSAGE, aqnr.class);
    }

    private aqnr() {
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
                return newMessageInfo(a, "\u0001\f\u0001\u0001\u0001\r\f\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0005ဈ\u0003\u0006ᐼ\u0000\u0007ᐼ\u0000\bဈ\b\tင\u0005\u000bဈ\t\fင\n\rဈ\u000b", new Object[]{"e", "d", "c", "f", "g", "h", "j", "i", avgg.class, aqnq.class, "l", "k", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new aqnr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (aqnr.class) {
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
