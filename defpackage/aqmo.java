package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqmo extends aonm implements aooz {
    public static final aqmo a;
    public static final aonk b;
    private static volatile aopf q;
    public int c;
    public int h;
    public int j;
    public avgg k;
    public int l;
    public avgg p;
    private byte r = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String m = "";
    public String n = "";
    public aony o = emptyProtobufList();

    static {
        aqmo aqmoVar = new aqmo();
        a = aqmoVar;
        aonm.registerDefaultInstance(aqmo.class, aqmoVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, aqmoVar, aqmoVar, null, 284, aoqn.MESSAGE, aqmo.class);
    }

    private aqmo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007င\u0006\bᐉ\u0007\tင\b\nဈ\t\u000bဈ\n\f\u001b\rᐉ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", apjq.class, "p"});
            case NEW_MUTABLE_INSTANCE:
                return new aqmo();
            case NEW_BUILDER:
                return new aone((short[][]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (aqmo.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
