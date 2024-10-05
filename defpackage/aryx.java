package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aryx extends aonm implements aooz {
    public static final aryx a;
    private static volatile aopf o;
    public int b;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public String l;
    public avgg m;
    public String n;
    private byte p = 2;
    public String c = "";
    public String d = "";

    static {
        aryx aryxVar = new aryx();
        a = aryxVar;
        aonm.registerDefaultInstance(aryx.class, aryxVar);
    }

    private aryx() {
        aonm.emptyProtobufList();
        this.l = "";
        this.n = "";
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001*\f\u0000\u0000\u0001\u0001ဈ\u0000\u000fဈ\u0001\u0010ဃ\u0002\u0011ဇ\u0003\u0013ဈ\r\u0018ဇ\t\u0019ᐉ\u0012\u001bဇ\u0007\u001dင\f!ဈ\u0016'ဌ\u000b*ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "l", "i", "m", "h", "k", "n", "j", aszn.a(), "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aryx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (aryx.class) {
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
