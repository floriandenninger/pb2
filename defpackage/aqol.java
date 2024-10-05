package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqol extends aonm implements aooz {
    public static final aqol a;
    public static final aonk b;
    private static volatile aopf s;
    public int c;
    public avgg e;
    public int h;
    public int k;
    public boolean m;
    public boolean n;
    public int o;
    private byte t = 2;
    public String d = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String j = "";
    public String l = "";
    public String p = "";
    public String q = "";
    public aony r = emptyProtobufList();

    static {
        aqol aqolVar = new aqol();
        a = aqolVar;
        aonm.registerDefaultInstance(aqol.class, aqolVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, aqolVar, aqolVar, null, 173, aoqn.MESSAGE, aqol.class);
    }

    private aqol() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0006\u0007င\u0007\bဈ\b\tဇ\t\nဇ\n\u000bင\u000b\rဈ\f\u000eဈ\u0005\u000fဈ\r\u0011\u001b", new Object[]{"c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "i", "q", "r", apjq.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqol();
            case NEW_BUILDER:
                return new aone((float[][]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = s;
                if (aopfVar == null) {
                    synchronized (aqol.class) {
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
