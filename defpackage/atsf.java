package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atsf extends aonm implements aooz {
    private static volatile aopf G;
    public static final aonv a = new atpn(3);
    public static final atsf b;
    public long A;
    public boolean B;
    public aqif D;
    public int E;
    public boolean F;
    private int H;
    public int c;
    public boolean d;
    public boolean f;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;
    private byte I = 2;
    public aonu e = emptyIntList();
    public aony g = emptyProtobufList();
    public aonu C = emptyIntList();

    static {
        atsf atsfVar = new atsf();
        b = atsfVar;
        aonm.registerDefaultInstance(atsf.class, atsfVar);
    }

    private atsf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.I);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.I = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u001d\u0000\u0002\u0001@\u001d\u0000\u0003\u0001\u0001ဇ\u0000\u0006\u0016\u0014ဇ\u0011\u0018Л\u001aဇ\u0013\u001bဇ\u0014\u001dဇ\u0016\u001fဇ\u0018\"ဇ\u001b%ဇ\u001e'ဇ (င!)ခ\"-ဇ%.ဇ&0ဇ(1ဇ)2ဇ*4ဇ+7ဇ-8ဇ.9ဇ/:ဂ0;ဂ1<ဇ2=\u001e>ဉ3?င4@ဇ5", new Object[]{"H", "c", "d", "e", "f", "g", aqxz.class, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", apea.a(), "D", "E", "F"});
            case NEW_MUTABLE_INSTANCE:
                return new atsf();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = G;
                if (aopfVar == null) {
                    synchronized (atsf.class) {
                        aopfVar = G;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            G = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
