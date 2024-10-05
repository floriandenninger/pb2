package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awjc extends aonm implements aooz {
    public static final awjc a;
    public static final aonk b;
    private static volatile aopf o;
    public int c;
    public String e;
    public String f;
    public String g;
    public awnd h;
    public aqyg i;
    public int j;
    public avgg k;
    public aony l;
    public aony m;
    public aoot n = aoot.a;
    private byte p = 2;
    public String d = "";

    static {
        awjc awjcVar = new awjc();
        a = awjcVar;
        aonm.registerDefaultInstance(awjc.class, awjcVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, awjcVar, awjcVar, null, 154, aoqn.MESSAGE, awjc.class);
    }

    private awjc() {
        aomf aomfVar = aomf.b;
        this.e = "";
        this.f = "";
        this.g = "";
        this.l = aonm.emptyProtobufList();
        this.m = aonm.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0001\u0002\u0004\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ᐉ\u0005\u0007ဌ\u0007\bᐉ\b\t\u001a\n\u001a\u000bв\fᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "j", awje.a(), "k", "l", "m", "n", awjb.a, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new awjc();
            case NEW_BUILDER:
                return new aone((char[][][]) null, (int[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (awjc.class) {
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
