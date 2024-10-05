package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atcl extends aonm implements aooz {
    public static final atcl a;
    private static volatile aopf o;
    public int b;
    public aquv c;
    public atsh d;
    public apks e;
    public auij f;
    public atuc g;
    public aqvb h;
    public apdj i;
    public apkr j;
    public atcm k;
    public atwh l;
    public auic m;
    public auml n;
    private byte p = 2;

    static {
        atcl atclVar = new atcl();
        a = atclVar;
        aonm.registerDefaultInstance(atcl.class, atclVar);
    }

    private atcl() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\uee52喠\f\u0000\u0000\u0001\u0002ဉ\u000b\u0003ဉ\f\u0004ဉ\r\u0005ဉ\u000e\u0006ဉ\u000f麗䉳ဉ\u0001\ue99c䗄ᐉ\u0002ﺕ䠈ဉ\u0005\uee53䬕ဉ\u0007\ue0b1䭝ဉ\u0006\ue536冡ဉ\b\uee52喠ဉ\n", new Object[]{"b", "j", "k", "l", "m", "n", "c", "d", "e", "g", "f", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new atcl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (atcl.class) {
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
