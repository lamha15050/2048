/********************
 * 
 * Name : Lamha Goel
 * Roll No. : 2015050
 * 
 ********************/


import java.util.*;

public class MyPuzzle {
	int[][] grid=new int[4][4];
	public MyPuzzle(){
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				grid[i][j]=0;
			}
		}
		generateTile();
	}
	public void generateTile()
	{
		Random r=new Random();
		int x=r.nextInt(100);
		if(x<75)
		{
			x=2;
		}
		else
		{
			x=4;
		}
		ArrayList<Integer> empty = new ArrayList<Integer>();
		int i,j,y=0;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(grid[i][j]==0)
				{
					empty.add(i*10+j);
					y++;
				}
			}
		}
		y=r.nextInt(y);
		y=empty.get(y);
		grid[y/10][y%10]=x;
	}
	public void displayGrid()
	{
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}
	public boolean moveRight()
	{
		int i,j,temp;
		boolean moved=false;
		for(i=0;i<4;i++)
		{
			for(j=2;j>=0;j--)
			{
				if(grid[i][j]!=0)
				{
					temp=j+1;
					while(temp<4 && grid[i][temp]==0)
					{
						temp++;
					}
					temp--;
					if(temp!=j)
					{
						grid[i][temp]=grid[i][j];
						grid[i][j]=0;
						moved=true;
					}
				}
			}
			for(j=2;j>=0;j--)
			{
				if(grid[i][j]!=0)
				{
					if(grid[i][j+1]==grid[i][j])
					{
						grid[i][j+1]*=2;
						grid[i][j]=0;
						moved=true;
					}
				}
			}
			for(j=2;j>=0;j--)
			{
				if(grid[i][j]!=0)
				{
					temp=j+1;
					while(temp<4 && grid[i][temp]==0)
					{
						temp++;
					}
					temp--;
					if(temp!=j)
					{
						grid[i][temp]=grid[i][j];
						grid[i][j]=0;
						moved=true;
					}
				}
			}

		}
		if(moved){
			generateTile();
		}
		return moved;
	}
	public boolean moveLeft()
	{
		int i,j,temp;
		boolean moved=false;
		for(i=0;i<4;i++)
		{
			for(j=1;j<4;j++)
			{
				if(grid[i][j]!=0)
				{
					temp=j-1;
					while(temp>=0 && grid[i][temp]==0)
					{
						temp--;
					}
					temp++;
					if(temp!=j)
					{
						grid[i][temp]=grid[i][j];
						grid[i][j]=0;
						moved=true;
					}
				}
			}
			for(j=1;j<4;j++)
			{
				if(grid[i][j]!=0)
				{
					if(grid[i][j-1]==grid[i][j])
					{
						grid[i][j-1]*=2;
						grid[i][j]=0;
						moved=true;
					}
				}
			}
			for(j=1;j<4;j++)
			{
				if(grid[i][j]!=0)
				{
					temp=j-1;
					while(temp>=0 && grid[i][temp]==0)
					{
						temp--;
					}
					temp++;
					if(temp!=j)
					{
						grid[i][temp]=grid[i][j];
						grid[i][j]=0;
						moved=true;
					}
				}
			}

		}
		if(moved){
			generateTile();
		}
		return moved;
	}
	public boolean moveUp()
	{
		int i,j,temp;
		boolean moved=false;
		for(j=0;j<4;j++)
		{
			for(i=1;i<4;i++)
			{
				if(grid[i][j]!=0)
				{
					temp=i-1;
					while(temp>=0 && grid[temp][j]==0)
					{
						temp--;
					}
					temp++;
					if(temp!=i)
					{
						grid[temp][j]=grid[i][j];
						grid[i][j]=0;
						moved=true;
					}
				}
			}
			for(i=1;i<4;i++)
			{
				if(grid[i][j]!=0)
				{
					if(grid[i-1][j]==grid[i][j])
					{
						grid[i-1][j]*=2;
						grid[i][j]=0;
						moved=true;
					}
				}
			}
			for(i=1;i<4;i++)
			{
				if(grid[i][j]!=0)
				{
					temp=i-1;
					while(temp>=0 && grid[temp][j]==0)
					{
						temp--;
					}
					temp++;
					if(temp!=i)
					{
						grid[temp][j]=grid[i][j];
						grid[i][j]=0;
						moved=true;
					}
				}
			}

		}
		if(moved){
			generateTile();
		}
		return moved;
	}
	public boolean moveDown()
	{
		int i,j,temp;
		boolean moved=false;
		for(j=0;j<4;j++)
		{
			for(i=2;i>=0;i--)
			{
				if(grid[i][j]!=0)
				{
					temp=i+1;
					while(temp<4 && grid[temp][j]==0)
					{
						temp++;
					}
					temp--;
					if(temp!=i)
					{
						grid[temp][j]=grid[i][j];
						grid[i][j]=0;
						moved=true;
					}
				}
			}
			for(i=2;i>=0;i--)
			{
				if(grid[i][j]!=0)
				{
					if(grid[i+1][j]==grid[i][j])
					{
						grid[i+1][j]*=2;
						grid[i][j]=0;
						moved=true;
					}
				}
			}
			for(i=2;i>=0;i--)
			{
				if(grid[i][j]!=0)
				{
					temp=i+1;
					while(temp<4 && grid[temp][j]==0)
					{
						temp++;
					}
					temp--;
					if(temp!=i)
					{
						grid[temp][j]=grid[i][j];
						grid[i][j]=0;
						moved=true;
					}
				}
			}

		}
		if(moved){
			generateTile();
		}
		return moved;
	}
	public boolean isOver(){
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(grid[i][j]==0)
				{
					return false;
				}
				if(i>0 && grid[i-1][j]==grid[i][j])
				{
					return false;
				}
				if(i<3 && grid[i+1][j]==grid[i][j])
				{
					return false;
				}
				if(j>0 && grid[i][j-1]==grid[i][j])
				{
					return false;
				}
				if(j<3 && grid[i][j+1]==grid[i][j])
				{
					return false;
				}
			}
		}
		return true;
	}
	public void hasWon()
	{
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(grid[i][j]==2048)
				{
					System.out.println("You Win!");
					break;
				}
			}
		}
	}
}
